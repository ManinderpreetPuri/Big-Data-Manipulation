set hivevar:studentId=12345678; --Please replace it with your student id
DROP TABLE ${studentId}_twitterdata;

-- Create a table for the input data
CREATE TABLE ${studentId}_twitterdata (
    tokenType STRING, month STRING, count BIGINT, hashtagName STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '\t';

-- Load the input data
LOAD DATA LOCAL INPATH 'Input_data/twitter-small.tsv' INTO TABLE ${studentId}_twitterdata;

-- Question 2a
-- TODO: *** Put your solution here ***


--Dump the output to file
INSERT OVERWRITE LOCAL DIRECTORY './Task_2a-out/'
ROW FORMAT DELIMITED
    FIELDS TERMINATED BY '\t'
    STORED AS TEXTFILE
    SELECT * FROM ${studentId}_toptweetmonths;
