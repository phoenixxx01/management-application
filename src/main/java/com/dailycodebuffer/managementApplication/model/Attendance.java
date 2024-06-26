package com.dailycodebuffer.managementApplication.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
    @Table(name = "attendance")
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor

    public class Attendance {
        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)

        private Long id;

        private LocalDateTime dateTime;
}
