package se.lexicon.teaterwebapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.teaterwebapp.model.entity.Calendar;
import se.lexicon.teaterwebapp.model.entity.Member;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.time.LocalDate;

@Repository
public interface CalendarRepository extends CrudRepository<Calendar, Integer> {
    Optional<Calendar> findById(Integer id);
    Optional<Calendar> findByTitle(String title);

    List<Calendar> findAllByOrderByDateAsc();
    List<Calendar> findByDateBetween(LocalDateTime startDate, LocalDateTime endDate);
    List<Calendar> findByCreatedBy(Member member);
}
