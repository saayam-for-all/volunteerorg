package com.sfa.saayam_volunteerorg_service.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sfa.saayam_volunteerorg_service.model.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, String>{

}