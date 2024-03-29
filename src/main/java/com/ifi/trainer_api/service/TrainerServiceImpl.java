package com.ifi.trainer_api.service;

import com.ifi.trainer_api.bo.Trainer;
import com.ifi.trainer_api.repository.TrainerRepository;
import org.springframework.stereotype.Service;

@Service
public class TrainerServiceImpl implements TrainerService{
    private TrainerRepository trainerRepository;

    public TrainerServiceImpl(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    @Override
    public Iterable<Trainer> getAllTrainers() {
        // TODO
        return trainerRepository.findAll();
    }

    @Override
    public Trainer getTrainer(String name) {
        // TODO
        return trainerRepository.findById(name).orElse(null);
    }

    @Override
    public Trainer createTrainer(Trainer trainer) {
        // TODO
        return  trainerRepository.save(trainer);
    }

    @Override
    public void deleteTrainer(String name) {
        // TODO
        trainerRepository.deleteById(name);
    }
}
