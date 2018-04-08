package com.siwoo.projpa.repository;

import com.siwoo.projpa.domain.Journal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface JournalRepository extends JpaRepository<Journal, Long> {

}
