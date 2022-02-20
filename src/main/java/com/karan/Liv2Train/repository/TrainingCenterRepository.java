package com.karan.Liv2Train.repository;

import com.karan.Liv2Train.model.TrainingCenter;

import java.util.List;

public interface TrainingCenterRepository {

    TrainingCenter saveCenter(TrainingCenter trainingCenter);
    List<TrainingCenter> retrieveAllCenters();
}
