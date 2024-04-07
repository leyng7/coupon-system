package org.example.consumer.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FailedEvent {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    protected FailedEvent(Long id, Long userId) {
        this.id = id;
        this.userId = userId;
    }

    public FailedEvent(Long userId) {
        this.userId = userId;
    }

}
