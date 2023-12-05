package io.github.ecrdeveloper.service;

import io.github.ecrdeveloper.model.Employee;
import io.github.ecrdeveloper.model.Position;

import io.github.ecrdeveloper.ValidationException;

public class PromotionService {

    public void promote(Employee employee, boolean targetReached) {
        Position currentPosition = employee.getPosition();
        if (Position.MANAGER == currentPosition) {
            throw new ValidationException("Manager can't be promoted!");
        }

        if (targetReached) {
            Position newPosition = currentPosition.getNextPosition();
            employee.promote(newPosition);
        } else {
            throw new ValidationException("Employee didn't reach the goal!");
        }
    }
    
}
