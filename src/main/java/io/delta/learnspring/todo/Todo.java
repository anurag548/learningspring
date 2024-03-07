package io.delta.learnspring.todo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class Todo {

    private Long id;

    private String username;

    private LocalDate targetDate;

    private LocalDate createdAt;

    private boolean done;

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", targetDate=" + targetDate +
                ", createdAt=" + createdAt +
                ", done=" + done +
                '}';
    }
}
