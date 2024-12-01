package com.couchbase.couchbase_demo;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CouchbaseRepository<Employee, String> {
}
