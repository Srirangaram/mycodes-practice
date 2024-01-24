CREATE DATABASE ipl_scores;
USE ipl_scores;

CREATE TABLE scores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    team1 VARCHAR(50),
    team2 VARCHAR(50),
    score1 INT,
    score2 INT,
    match_status VARCHAR(50),
    last_updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

select * from scores;
drop table scores;
-- Create the main scores table
CREATE TABLE scores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    team1 VARCHAR(50),
    team2 VARCHAR(50),
    score1 INT,
    score2 INT,
    match_status VARCHAR(50),
    last_updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- Create the staging table
CREATE TABLE staging_scores (
    team1 VARCHAR(50),
    team2 VARCHAR(50),
    score1 INT,
    score2 INT,
    match_status VARCHAR(50)
);

-- Stored procedure to update scores
DELIMITER //

CREATE PROCEDURE UpdateScores()
BEGIN
    -- Assuming you have inserted data into staging_scores using your data fetching mechanism
    -- You may replace the SELECT statement with your actual data-fetching logic
    
    -- Insert or update scores in the main table
    INSERT INTO scores (team1, team2, score1, score2, match_status)
    SELECT
        s.team1,
        s.team2,
        s.score1,
        s.score2,
        s.match_status
    FROM
        staging_scores s
    ON DUPLICATE KEY UPDATE
        score1 = s.score1,
        score2 = s.score2,
        match_status = s.match_status,
        last_updated = CURRENT_TIMESTAMP;
    
    -- Truncate the staging table after updating
    TRUNCATE TABLE staging_scores;
END //

DELIMITER ;

select * from scores;

insert into scores(

    team1 ,
    team2 ,
    score1 ,
    score2 ,
    match_status ,
    last_updated ) values("CSK", "RCB", 12, 15, "win", '2022-01-01 12:34:56'), ("KXIP", "RR", 14, 12, "loss", '2022-01-02 12:14:51'), ("CSK", "RCB", 12, 15, "win", '2022-01-01 12:34:56');

