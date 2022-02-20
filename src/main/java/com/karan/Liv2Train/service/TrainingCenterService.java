package com.karan.Liv2Train.service;

import com.karan.Liv2Train.model.TrainingCenter;

import java.util.List;

public interface TrainingCenterService {

    TrainingCenter save(TrainingCenter trainingCenter);
    List<TrainingCenter> getAll();
}
