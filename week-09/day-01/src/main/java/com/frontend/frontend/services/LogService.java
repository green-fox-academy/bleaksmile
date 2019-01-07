package com.frontend.frontend.services;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.frontend.frontend.models.Log;
import com.frontend.frontend.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {


  @JsonIgnore
  private LogRepository logRepository;

  private List<Log> entries;
  private Integer entry_count;

  @Autowired
  public LogService(LogRepository logRepository) {
    this.logRepository =logRepository;
  }

  public void fetch(){
    this.entries = (List<Log>) logRepository.findAll();
    this.entry_count = ((List<Log>) logRepository.findAll()).size();
  }
  public void save(Log log) {
    logRepository.save(log);
  }

  public LogRepository getLogRepository() {
    return logRepository;
  }

  public void setLogRepository(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  public List<Log> getEntries() {
    return entries;
  }

  public void setEntries(List<Log> entries) {
    this.entries = entries;
  }

  public Integer getEntry_count() {
    return entry_count;
  }

  public void setEntry_count(Integer entry_count) {
    this.entry_count = entry_count;
  }
}
