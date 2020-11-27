DROP TABLE IF EXISTS ClaimInfo;
CREATE TABLE ClaimInfo (
    claimId VARCHAR(50) NOT NULL,
    productName VARCHAR(50),
    claimDate VARCHAR(50),
    claimStatus VARCHAR(50),
    PRIMARY KEY (claimId)
);