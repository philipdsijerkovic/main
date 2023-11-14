CREATE TABLE writer_requests (
    id BIGINT NOT NULL AUTO_INCREMENT,
    request_text VARCHAR(255),
    request_type VARCHAR(255),
    PRIMARY KEY (id)
);
