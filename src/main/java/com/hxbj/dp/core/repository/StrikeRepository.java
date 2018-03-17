package com.hxbj.dp.core.repository;

import com.hxbj.dp.core.entity.Strike;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * wang 2018/1/31
 */
@Repository
public interface StrikeRepository extends MongoRepository<Strike, String> {

  Page<Strike> findByDataTypeAndPlayerIdAndRaceIdAndActionCodeLike(String dataType, String playerId,
      String raceId, String actionCode, Pageable pageable);

  Page<Strike> findByDataTypeAndPlayerIdAndRaceIdAndActionCodeLikeAndIsValid(String dataType,
      String playerId, String raceId, String actionCode, int isValid, Pageable pageable);

  Page<Strike> findByDataTypeAndPlayerIdAndRaceIdAndActionCodeLikeAndRound(String dataType,
      String playerId, String raceId, String actionCode, int round, Pageable pageable);

  Page<Strike> findByDataTypeAndPlayerIdAndRaceIdAndActionCodeLikeAndIsValidAndRound(
      String dataType, String playerId, String raceId, String actionCode, int isValid, int round,
      Pageable pageable);


  Page<Strike> findByDataTypeAndRaceIdAndActionCodeLike(String dataType, String raceId,
      String actionCode, Pageable pageable);

  Page<Strike> findByDataTypeAndRaceIdAndActionCodeLikeAndIsValid(String dataType, String raceId,
      String actionCode, int isValid, Pageable pageable);

  Page<Strike> findByDataTypeAndRaceIdAndActionCodeLikeAndRound(String dataType, String raceId,
      String actionCode, int round, Pageable pageable);

  Page<Strike> findByDataTypeAndRaceIdAndActionCodeLikeAndIsValidAndRound(String dataType,
      String raceId, String actionCode, int isValid, int round, Pageable pageable);


  Page<Strike> findByDataTypeAndScheduleIdAndActionCodeLike(String dataType, String scheduleId,
      String actionCode, Pageable pageable);

  Page<Strike> findByDataTypeAndScheduleIdAndActionCodeLikeAndIsValid(String dataType,
      String scheduleId, String actionCode, int isValid, Pageable pageable);

  Page<Strike> findByDataTypeAndScheduleIdAndActionCodeLikeAndRound(String dataType,
      String scheduleId, String actionCode, int round, Pageable pageable);

  Page<Strike> findByDataTypeAndScheduleIdAndActionCodeLikeAndIsValidAndRound(String dataType,
      String scheduleId, String actionCode, int isValid, int round, Pageable pageable);


  Page<Strike> findByDataTypeAndEventIdAndActionCodeLike(String dataType, String eventId,
      String actionCode, Pageable pageable);

  Page<Strike> findByDataTypeAndEventIdAndActionCodeLikeAndIsValid(String dataType, String eventId,
      String actionCode, int isValid, Pageable pageable);

  Page<Strike> findByDataTypeAndEventIdAndActionCodeLikeAndRound(String dataType, String eventId,
      String actionCode, int round, Pageable pageable);

  Page<Strike> findByDataTypeAndEventIdAndActionCodeLikeAndIsValidAndRound(String dataType,
      String eventId, String actionCode, int isValid, int round, Pageable pageable);


  Page<Strike> findAllByDataType(String dataType, Pageable pageable);

  Page<Strike> findAllByDataTypeAndIsValid(String dataType, int isValid, Pageable pageable);

  Page<Strike> findAllByDataTypeAndRound(String dataType, int round, Pageable pageable);

  Page<Strike> findAllByDataTypeAndIsValidAndRound(String dataType, int isValid, int round,
      Pageable pageable);
}
