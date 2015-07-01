CREATE KEYSPACE IF NOT EXISTS test WITH replication = {
  'class': 'SimpleStrategy',
  'replication_factor': '1'
};

USE test;

CREATE TABLE IF NOT EXISTS hello (
  language TEXT,
  greeting TEXT,
  name TEXT,
  PRIMARY KEY (language)
);

INSERT INTO hello (language, greeting, name) VALUES ('hello', 'world', 'English');
INSERT INTO hello (language, greeting, name) VALUES ('Chinese', '你好', '世界');
