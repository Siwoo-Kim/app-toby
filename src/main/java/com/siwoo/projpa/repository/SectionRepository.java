package com.siwoo.projpa.repository;

import com.siwoo.projpa.domain.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface SectionRepository extends JpaRepository<Section, Long> {

    @Query("select max(s.basicTime.updated), p.name from Section s inner join s.project p group by p")
    List<Object[]> findMaxUpdateTimeAndProjectGroupByProject();
}
