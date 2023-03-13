create table if not exists photos(
    id bigint primary key AUTO_INCREMENT,
    file_name varchar(255),
    content_type varchar(255),
    data varbinary(1000000)
);