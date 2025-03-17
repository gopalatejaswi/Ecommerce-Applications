package com.ecomm.Myntra.repository;

/* 
public interface Tutorialrepository {

}
*/

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ecomm.Myntra.model.tutorial;


public interface Tutorialrepository extends JpaRepository<tutorial, Long> {
  List<tutorial> findByPublished(boolean published);
  List<tutorial> findByTitleContainingIgnoreCase(String title);
}

