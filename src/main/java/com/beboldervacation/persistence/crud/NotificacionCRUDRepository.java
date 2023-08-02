package com.beboldervacation.persistence.crud;

import com.beboldervacation.persistence.entity.Notificacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NotificacionCRUDRepository extends CrudRepository<Notificacion, Integer> {
}
