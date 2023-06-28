package com.api.parkingcontrol.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;

import jakarta.transaction.Transactional;


@Service
public class ParkingSpotService {

    ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }
    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }
    public boolean existsByLicensePlateCar(String licensePlateCar) {
        return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
    }
    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }
    public boolean existsByApartmentAndBlock(String apartment, String apartmentBlock) {
        return parkingSpotRepository.existsByApartmentAndApartmentBlock(apartment, apartmentBlock);
    }
    public Page<ParkingSpotModel> getAll(Pageable pageable) {
        return parkingSpotRepository.findAll(pageable);
    }
    public Optional<ParkingSpotModel> getById(UUID id) {
        return parkingSpotRepository.findById(id);
    }
    @Transactional
    public void delete(UUID id) {
        parkingSpotRepository.deleteById(id);
    }
}
