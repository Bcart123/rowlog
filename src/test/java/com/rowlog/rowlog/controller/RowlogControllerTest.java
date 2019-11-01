package com.rowlog.rowlog.controller;

import com.rowlog.rowlog.models.Workout;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RowlogControllerTest {
    private RowlogController rowlogController = new RowlogController();

    @Test
    void getWorkout() {
        Workout workout = rowlogController.getWorkout(5);
        assertNotNull(workout, "Workout is null");
    }
}