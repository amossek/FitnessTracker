package pl.wsb.fitnesstracker.healthmetrics;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name = "health metrics")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString


public class HealthsMetrics {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Nullable
        private Long id;

        @Column(name = "user_id", nullable = false)
        private Long userID;

        @Column(name = "date", nullable = false)
        private LocalDate date;

        @Column(name = "weight", nullable = false)
        private Double weight;

        @Column(name = "height", nullable = false)
        private Double height;

        @Column(name = "heart_rate", nullable = false)
        private Integer heartRate;

        public HealthsMetrics(@Nullable Long id, Long userID, LocalDate date, Double weight, Double height, Integer heartRate) {
            this.id = id;
            this.userID = userID;
            this.date = date;
            this.weight = weight;
            this.height = height;
            this.heartRate = heartRate;
        }


}
