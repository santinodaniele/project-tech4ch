# TECH4CH
### System requirements and goals
The project goal is to replicate a study that was published at PUC, which studies the behavior of visitors in the Reuben Hecht museum, analyzing their movements and their time spent near multiple points of interest. In order to replicate this study, we needed to implement a web service, that given the museum floor plan and a set of visitors logs, shows some statistics about the museum and can *play back* a visit of a selected group or individual.
### Software used
* MYSQL database, to store data about visitors
* Spring Boot, to create a web service following the MVC design path
* CanvasJS, to render statistics
* Hipster4J, to create the graph and a search algorithm
* D3.js, to animate all transition between points
* Amazon AWS Educate, to deploy the web service
### System structure
We created a MYSQL database importing the .csv samples file and storing information about visitors. Then, we built our **Model**:
* Poi, this class stores information about the points of interest in the museum
* Visitor, this class stores information about the visitors information
* Room, this class stores information about the rooms in the museum
* Museum, this class stores all the previous information

We implemented **Generator** classes which retrieve data from the database and create our model classes. After this, we coded some auxiliary methods to create some statistics about the visitors: best holding power pois, best attraction power pois, general statistics about pois, museum visitors per hour, museum visitors per room per hour.
We decided to generate charts for the statistics, so we used CanavasJS library to code the controller and to render the JSP pages.
### Home
![Home](/readme_images/home.png)
### Best attraction power POIs
![Best attraction power POIs](/readme_images/bestAttraction.png)
### Best holding power POIs
![Best holding power POIs](/readme_images/bestHolding.png)
### General Statistics
![General Statistics](/readme_images/generalStats.png)
### Visitor per hour in the museum
![Visitor per hour in the museum](/readme_images/vph.png)
### Visitor per room per hour in the museum
![Visitor per room per hour in the museum](/readme_images/vprh.png)
### Revisit a visit feature
![Revisit a visit](/readme_images/revisit.png)
### Visitor summary
![Visitor summary](/readme_images/summary.png)

### Useful links
[Google Drive](https://drive.google.com/drive/folders/19QWEDkNJqjvCK_xBAprgXK5Eo-fnBnlB?usp=sharing>)  
[Web Service](http://tech4chproject-env.eba-t5wipbv2.us-east-1.elasticbeanstalk.com)
### Work distribution
* Database, Daniele and Federico designed and implemented the database structure and Alexandru helped formatting the csv files with AWK scripts
* Dynamic Web Project, Alexandru implemented the structure of the project, Daniele and Federico reviewed the code and made some tweaks
* Charts, Federico and Daniele used CanavsJS to render the statistics, coding the **Controller** classes and JSP pages
* Graph, Federico got all the POIs position with a script, Alexandru created the graph and applied Dijkstra algorithm
* Points animation, Federico and Daniele made the animation between points
* Amazon AWS, Daniele deployed the project
### Challenges/problems encountered
The main problem was to implement the *Revisit a visit* feature.  
Given the museum floor map, we got all the POIs position from the image using a JavaScript script, create a graph introducing auxiliary nodes between POI nodes to avoid collisions with the walls and apply a pathfinding algorithm using Hipster4J library, that given a POI list of a visitor it will show on the map its movement.

### What did we get from this assignment
Most of the patterns we used to implement this service was already studied with our Prof. Paolo Merialdo in his course **Sistemi Informativi sul Web**. The new things that we learned is coding in JavaScript, making animation and charts.
