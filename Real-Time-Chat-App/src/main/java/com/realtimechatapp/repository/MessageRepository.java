package com.realtimechatapp.repository;

import com.realtimechatapp.entity.Message;
import com.realtimechatapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

    List<Message> findBySenderAndReceiverOrderBySentAtDesc(User sender, User receiver);

    @Query("SELECT m FROM Message m where"+
    "(m.sender = :user1 AND m.receiver = :user2) OR "+
    "(m.sender = :user2 AND m.receiver = :user1)"+
    "ORDER BY m.sentAt ASC")
    List<Message> findConversation(User user1, User user2);

    @Query("SELECT m FROM Message m WHERE m.saved = false and m.sentAt< :expiryTime")
    List<Message> findExpiredMessage(LocalDateTime expiryTime);

}
