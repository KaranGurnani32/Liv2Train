package com.karan.Liv2Train.service;

import com.karan.Liv2Train.model.TrainingCenter;
import com.karan.Liv2Train.repository.TrainingCenterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class TrainingCenterServiceImpl implements TrainingCenterService{

    private final TrainingCenterRepository repository;

    public TrainingCenterServiceImpl(TrainingCenterRepository repository) {
        this.repository = repository;
    }

    private boolean validate(TrainingCenter trainingCenter) {
        boolean centerName = validateCenterName(trainingCenter.getCenterName());
        boolean codeCheck = validateCode(trainingCenter.getCenterCode());
        boolean emailCheck = validateEmail(trainingCenter.getContactEmail());
        boolean phoneCheck = validatePhone(trainingCenter.getContactPhone());

        return centerName && codeCheck && emailCheck && phoneCheck;
    }

    private boolean validateCenterName(String centerName) {
        return centerName.length() <= 40;
    }

    private boolean validateCode(String code) {
        Pattern VALID_CENTER_CODE_REGEX = Pattern.compile("^\\w{12}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = VALID_CENTER_CODE_REGEX.matcher(code);
        return matcher.find();
    }

    private boolean validateEmail(String email) {
        Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        return matcher.find();
    }

    private boolean validatePhone(String phone) {
        Pattern VALID_PHONE_REGEX = Pattern.compile("^\\d{10}$");
        Matcher matcher = VALID_PHONE_REGEX.matcher(phone);
        return matcher.find();
    }



    @Override
    public TrainingCenter save(TrainingCenter trainingCenter) {
        if(validate(trainingCenter)) {
            repository.saveCenter(trainingCenter);
            return trainingCenter;
        }
        return null;
    }

    @Override
    public List<TrainingCenter> getAll() {
        return repository.retrieveAllCenters();
    }
}
