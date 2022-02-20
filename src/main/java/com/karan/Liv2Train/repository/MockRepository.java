package com.karan.Liv2Train.repository;


import com.karan.Liv2Train.model.Address;
import com.karan.Liv2Train.model.TrainingCenter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class MockRepository implements TrainingCenterRepository {

    private List<TrainingCenter> centers;

    public MockRepository() {
        this.centers = new ArrayList<>();
        this.centers.add(new TrainingCenter("XYZ test center", "XYZ828531",
                new Address("A-1/34", " New Delhi", "Delhi", "110085"),
                100,
                new ArrayList<String>(Arrays.asList("Maths", "Science")),
                "2020/12/16",
                "xyz@gmail.com" , "8285310360"));
    }
    @Override
    public TrainingCenter saveCenter(TrainingCenter trainingCenter) {
        centers.add(trainingCenter);
        return trainingCenter;
    }

    @Override
    public List<TrainingCenter> retrieveAllCenters() {
        return centers;
    }
}
