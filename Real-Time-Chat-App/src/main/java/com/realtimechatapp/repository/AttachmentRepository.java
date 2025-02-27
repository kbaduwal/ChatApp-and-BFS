package com.realtimechatapp.repository;

import com.realtimechatapp.entity.Attachment;
import com.realtimechatapp.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment, Long> {

    Optional<Attachment> findByMessage(Message message);
}
