package me.dio.votacao.bbb.api.repository;

import me.dio.votacao.bbb.api.model.ParametroModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParametroRepository extends MongoRepository<ParametroModel, String> {
}
