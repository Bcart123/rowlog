package com.rowlog.rowlog.controller;

import com.rowlog.rowlog.models.Workout;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;

@RestController
public class RowlogController {

    public RowlogController() {

    }

    @GetMapping("/workout/{id}")
    public Workout getWorkout(@PathVariable int id) {
        return new Workout(10000, id, 120, Calendar.getInstance().getTime());
    }

}