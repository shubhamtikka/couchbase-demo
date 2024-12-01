package com.couchbase.couchbase_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

@Configuration
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {

    @Override
    public String getConnectionString() {
        return "couchbase://127.0.0.1"; // Use your connection string
    }

    @Override
    public String getUserName() {
        return "admin"; // Couchbase username
    }

    @Override
    public String getPassword() {
        return "password"; // Couchbase password
    }

    @Override
    public String getBucketName() {
        return "my_bucket"; // Bucket name
    }
}
