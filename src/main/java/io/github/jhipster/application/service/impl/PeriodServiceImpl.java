package io.github.jhipster.application.service.impl;

import io.github.jhipster.application.service.PeriodService;
import io.github.jhipster.application.domain.Period;
import io.github.jhipster.application.repository.PeriodRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing Period.
 */
@Service
@Transactional
public class PeriodServiceImpl implements PeriodService {

    private final Logger log = LoggerFactory.getLogger(PeriodServiceImpl.class);

    private final PeriodRepository periodRepository;

    public PeriodServiceImpl(PeriodRepository periodRepository) {
        this.periodRepository = periodRepository;
    }

    /**
     * Save a period.
     *
     * @param period the entity to save
     * @return the persisted entity
     */
    @Override
    public Period save(Period period) {
        log.debug("Request to save Period : {}", period);
        return periodRepository.save(period);
    }

    /**
     * Get all the periods.
     *
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<Period> findAll() {
        log.debug("Request to get all Periods");
        return periodRepository.findAll();
    }


    /**
     * Get one period by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<Period> findOne(Long id) {
        log.debug("Request to get Period : {}", id);
        return periodRepository.findById(id);
    }

    /**
     * Delete the period by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Period : {}", id);
        periodRepository.deleteById(id);
    }
}
