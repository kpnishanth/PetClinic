package org.springframework.samples.petclinic.web;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.model.Vet;
import org.springframework.samples.petclinic.model.Vets;
import org.springframework.samples.petclinic.service.ClinicService;
import org.springframework.ui.Model;

import javax.jws.WebParam;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class VetControllerTest {
    @Mock
    ClinicService clinicService;
    @InjectMocks
    VetController vetController;
    @Mock
    Map<String, Object> model;

    @BeforeEach
    void setUp() {
        Vet vet1 = new Vet();
        Vet vet2 = new Vet();
        List<Vet> vetList = List.of(vet1, vet2);

        when(clinicService.findVets()).thenReturn(vetList);
    }

    @Test
    void showVetList() {
        vetController.showVetList(model);
        verify(clinicService,times(1)).findVets();
        verify(model).put(any(),any());

    }

    @Test
    void showResourcesVetList() {
        Vets vets = vetController.showResourcesVetList();
        verify(clinicService,times(1)).findVets();

    }
}