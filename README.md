# TECH4CH

TECH4CH is a web service which shows statistics about the Reuben Hecht museum and implements the *Revisit a visit* feature.
We created a MYSQL database importing the .csv samples file and storing information about visitors.
Then, we built our **Model** classes:
* Poi, this class stores information about the points of interest in the museum
* Visitor, this class stores information about the visitors information
* Room, this class stores information about the rooms in the museum
* Museum, this class stores all the previous information

We implemented **Generator** classes which retrieve data from the database and then create our model classes. After this we coded some auxiliary methods to create some statistics about the visitors: best holding power pois, best attraction power pois, general statistics about pois, musuem visitors per hour, museum visitors per room per hour. Every statistics is generated graphically using CanavasJS library.
## Home
![Home](/readme_images/home.png)
## Best attraction power POIs
![Best attraction power POIs](/readme_images/bestAttraction.png)
## Best holding power POIs
![Best holding power POIs](/readme_images/bestHolding.png)
## General Statistics
![General Statistics](/readme_images/generalStats.png)
## Visitor per hour in the museum
![Visitor per hour in the museum](/readme_images/vph.png)
## Visitor per room per hour in the museum
![Visitor per room per hour in the museum](/readme_images/vprh.png)
