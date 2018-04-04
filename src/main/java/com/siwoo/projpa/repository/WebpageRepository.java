package com.siwoo.projpa.repository;

import com.siwoo.projpa.domain.WebPage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebpageRepository extends JpaRepository<WebPage, String> {

}
