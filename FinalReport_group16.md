<!-- 让表格居中显示的风格 -->
<style>
.center 
{
  width: auto;
  display: table;
  margin-left: auto;
  margin-right: auto;
}
</style>



# Software Engineering Group Project Final Report
<div style="text-align: center;">

![img_2.png](ReportImg/titoutu.png)  
Group 16
</div>

 
<div class="center">

| Name         | BUPTNumber | QMNumber  |
|:-------------|:----------:|:---------:|
| Xiaoyi Liang | 2019213029 | 190898395 |
| Ruoqi Zhang  | 2019213236 | 190900311 |
| 单元格          |    单元格     |    单元格    |
| 单元格          |    单元格     |    单元格    |
| 单元格          |    单元格     |    单元格    |
| 单元格          |    单元格     |    单元格    |
</div>

## 1.Introduction
The aim of this project is to develop a smart kiosks in front of its check-in desks at the London Heathrow Airport. The system is developed with Agile methods. To develop this system, we first have meetings to brainstorm
for specific requirements. Then we use some fact-finding techniques such as interviews, observation,
questionnaire and so on to make the requirements clear and accurate enough. Then we write java code
through iterative development. At the end, we improve the user interface and produce some documents like
user manuals. We hope every user of this software and our customer can be satisfied with this software.

## 2.Project management
### 2.1 Project Planning
This project adopts agile development method and agile project management process.Our development work is carried out according the recommendations in [Handout](https://qmplus.qmul.ac.uk/pluginfile.php/2604460/mod_resource/content/3/EBU6304_GroupProjectHandout_2022.pdf)
There maybe a little error of a few days when truly implement each iteration.Before beginning of each iteration, we took a group meeting to review the dependency analysis and the
activity network in project planning step to double check the dependencies between each task which is vital
in making a schedule. And you could get our meeting minutesin detail from our [QMplus hub Journals](https://hub.qmplus.qmul.ac.uk/artefact/blog/index.php?group=3633)
In this project, we used [JavaFX](https://openjfx.io/) to complete the GUI design, [Maven](https://maven.apache.org/) to manage the project and related packages, and [Github](https://github.com/SE-of-nobody/SmartFlightCheckInKiosk) to complete the team collaboration, version control and contribution statistics of the code.

<div class="center">

| Date             |                                                     Task                                                     |
|:-----------------|:------------------------------------------------------------------------------------------------------------:|
| 11-15 March      |                         Set up the QMPlus Hub group and discuss the project handout.                         | 
| 16-18 March      |                       Story writing workshop. Outcomes: product backlog and prototype                        |   
| 21 March-1 April |                Iteration 1 Complete most basic logic and functionality in the back-end design                |   
| 4-15 April       |                                 Iteration 2 Complete most of the GUI design                                  |   
| 18-29 April      |             Iteration 3 Complete building controllers that connect the different stage together              |  
| 2-13 May         | Iteration 4 Complete the docking work of Boradingpass part and supplement the logical code of the staff part |   
| 16-30 May        |                             Iteration 5 Complete appearance design and bug fixes                             |    
</div>

It is easy to see that a significant periodicity in our submissions from [Github's](https://github.com/SE-of-nobody/SmartFlightCheckInKiosk) code frequency
<div style="text-align: center;">

![img.png](ReportImg/github2.png)
</div>

### 2.2 Managing people
In terms of people management, we divide the work according to the interest of
different students. We use the way of team competition to motivate the members, and
the students who finish the task the fastest will be rewarded. We adhere to the principles
of consistency, respect, inclusion and honesty for team members.

<div class="center">

| Subgroup |                                     Members |                                                            Task                                                             |
|:---------|--------------------------------------------:|:---------------------------------------------------------------------------------------------------------------------------:|
| Group1   | Xiaoyi Liang<br/>Ruibo Gang<br/>Ruoqi Zhang |     In part Passenger, complete GUI design, code writing page and iteration, which including jump of the page and alert     |
| Group2   |                                  Liya Zhong |                            In part Staff, complete GUI design, code writing page and iteration.                             |
| Group3   |                                  Ziding Lin | In part Passenger, complete writing and iterating back-end code, which including login, transfer parameters and junit test. |
| Group4   |                                 Zhishang Yu |   In part Staff, complete writing and iterating back-end code, which including login, transfer parameters and junit test.   |

</div>

Otherwise, we use [Github](https://github.com/SE-of-nobody/SmartFlightCheckInKiosk)   recording everyone's commit.Of course, we also made a submission on QMhub

<div style="text-align: center;">

![img.png](ReportImg/GITHUB1.png)
</div>

Contribution in [Github](https://github.com/SE-of-nobody/SmartFlightCheckInKiosk) has a delay in counting submissions from the last two weeks, which means The data in the picture is for reference only.
### 2.3 Risk Management
In this project, we may encounter project risks and product risks. For the project risks, the approach we
took was to give the team members enough time. If one person can't get things done on time, others have
plenty of time to take over and get things done. Therefore, our schedule is slightly different from the
recommended schedule. For the product risks, we take the approach of multiple iterations + multiple
evaluations. At the end of each iteration, we would discuss the shortcomings of this iteration in the Wechat and evaluate our design and implementation. Once a problem is identified, it will be improved in
the next iteration. If a serious problem is found during the iteration, we do not change the plan in the
middle of the iteration, but choose to fix the problem in the next iteration. In fact, we did encounter a
serious problem and solved it using this method. Please see our weekly journals for details.
## 3.Requirements
### 3.1 Apply the requirements finding techniques
In this project, we used [JavaFX](https://openjfx.io/) to complete the GUI design, [Maven](https://maven.apache.org/) to manage the project and related packages, and [Github](https://github.com/SE-of-nobody/SmartFlightCheckInKiosk) to complete the team collaboration, version control and contribution statistics of the code.
### 3.2 User stories
In terms of user stories, we produce a large number of user stories, delete a batch through meetings, and
then evaluate and priorities the remaining parts.
We chose a different ID for each story.  According to the Specification in Handout, we chose different three-digit numbers.  Where the leading number indicates which part they belong to:
<div class="center">

| ID  |      Category      |
|:----|:------------------:|
| 1   |      Check-in      | 
| 2   |   Extra options    |   
| 3   |   Boarding pass    |   
| 4   |  Passengers list   |   
| 5   | Other requirements |   

</div>

Different second digits indicate that they belong to different problems, and the third digit represents different details of the same problem.

<div class="center">

| Story ID |                         Story Name |                                                           Description                                                            | Iteration version number |
|:---------|-----------------------------------:|:--------------------------------------------------------------------------------------------------------------------------------:|:------------------------:|
| 111      |                         check in 1 |                                               information by input booking number                                                |            1             |
| 112      |                         check in 2 |                        passengers can get their flight booking information by input surname and ID number                        |            1             |
| 113      |                         check in 3 |                         passengers can get their flight booking information by scanning the ID document                          |            1             |
| 114      |                         check in 4 |                           passengers can get their flight booking information by input booking number                            |            3             |
| 121      |                     flight summary |                                  system will show the summary of the flight booking information                                  |            1             |
| 131      |                      choose seat 1 |                                        passengers can choose the seat through the screen                                         |            1             |
| 132      |                      choose seat 2 |                                                     the seat has been chosen                                                     |            1             |
| 133      |                        choose meal |                                                  passengers can choose the meal                                                  |            1             |
| 134      |                            confirm |                                           passengers scan the ID document and confirm                                            |            1             |
| 211      |                    Extra options 1 |                                  choose special seating（ seat with extra legroom，gourmet menu）                                   |            1             |
| 212      |                    Extra options 2 |                                 ·Payment interface（ enter the details of customer's credit card)                                 |            2             |
| 213      |                    Extra options 3 |                                       ·final confirmation screen(information confirmation）                                       |            1             |
| 221      |                     Payment method |                                                    ·Multiple payment methods                                                     |            3             |
| 231      |      Operation interface interface |                                                        ·Visual seat style                                                        |            1             |
| 241      |              Service Customization |                                                 ·Service types can be customized                                                 |            1             |
| 311      |                    Boarding pass 1 |                           Passenger wants to get her/his boarding pass so she/he can get on the plane                            |            1             |
| 321      |          Check-in status display 1 |                            Passenger wants to know where should she/he drop her/his check-in packages                            |            2             |
| 322      |          Check-in status display 2 | passenger wants to change the number of the checkin packages because she/he hadn't count them correctly when booking the tickets |            3             |
| 411      |          Check-in status display 3 |                         Flight attendant can check the information of the passengers on a given flight.                          |            1             |
| 412      |          Check-in status display 4 |                       Flight attendant can check the check-in status of the passengers on a given flight.                        |            1             |
| 413      |          Check-in status display 5 |                       Flight attendant can easily count and focus on the unchecked passengers on the page.                       |            3             |
| 421      | Urgent reminder of late check-in 1 |                             Airport check-in staff can check check-in status of all upcoming flight.                             |            2             |
| 422      | Urgent reminder of late check-in 2 |             Airport check-in staff can easily focus on the unchecked passengers of all upcoming flight on the page.              |            3             |
| 423      | Urgent reminder of late check-in 3 |  Airport check-in staff can remind the uncheck-in passengers on departing flights within 30 minutes to check in by  broadcast.   |            4             |

</div>

### 3.3 Iterations planning
We plan our iterations according to the suggested Timeline in handout. There is error of a few days when
truly implement each iteration.
<div class="center">

| Date             |                                                     Task                                                     |
|:-----------------|:------------------------------------------------------------------------------------------------------------:|
| 21 March-1 April |                Iteration 1 Complete most basic logic and functionality in the back-end design                |   
| 4-15 April       |                                 Iteration 2 Complete most of the GUI design                                  |   
| 18-29 April      |             Iteration 3 Complete building controllers that connect the different stage together              |  
| 2-13 May         | Iteration 4 Complete the docking work of Boradingpass part and supplement the logical code of the staff part |   
| 16-30 May        |                             Iteration 5 Complete appearance design and bug fixes                             |    
</div>

### 3.4 Prototype
Depending on each person's job assignment, we will design the relevant GUI ourselves. Most of Prototype's designs were hand-drawn, which made our designs easier and more creative.

<div style="text-align: center;">

![img.png](ReportImg/protitype.png)  
Some screenshots of Prototype
</div>


As development progressed, our requirements changed, so the prototype was modified or redone many times. With these prototypes, developers can feel comfortable knowing what the software should be designed
to look like. Interactive prototypes allow developers to understand the logical structure of the user
interface. Moreover, these prototypes contain art materials and color schemes. This makes our software
more beautiful.

### 3.5 Adapt to changes
During the procedure of our project, there are plenty of changes in our initial iteration plan. For example, in the initial brainstorming we only discussed the implementation of the individual feature pages. When we linked the pages together, we realized that there were too many unnecessary page jumps, so we redesigned the main menu.
In addition, when designing the function of page jump, we also encountered a lot of difficulties, so we designed different schemes.  In the end, we adopted Ruibo Gang's solution to ensure smooth parameter transfer.
We have a routine meeting every week held by our team leader. During the conference, everyone put
forward their opinions toward the current project, for instance, problems meet when implement with code
and possible adjust to the requirement analysis. Then, the meeting recorder will log all these confusions and
we will have a fierce discussion to them. As a result, we may change in our product backlog and user stories
after the meeting.  

## 4.Analysis and Design

## 5.Implementation and Testing
## 6.Appendix
### Appendix-1 References
[1] [Github](https://github.com/SE-of-nobody/SmartFlightCheckInKiosk)  
[2] [Intro of Software Engineering by QMUL](https://qmplus.qmul.ac.uk/pluginfile.php/2574097/mod_resource/content/8/EBU6304_W1_Live_Introduction%20to%20Software%20Engineering_student.pdf)  
[3] [TDD by QMUL](https://qmplus.qmul.ac.uk/pluginfile.php/3179540/mod_resource/content/2/EBU6304_W6_Rec_TDD%20Demo%20-%20Mac%20Console%20Launcher.pdf)  
[4] [Development by QMUL](https://qmplus.qmul.ac.uk/pluginfile.php/3179536/mod_resource/content/3/EBU6304_W6_Rec_Test%20Driven%20Development.pdf)  
[5] [Implementation&Testing by QMUL](https://qmplus.qmul.ac.uk/pluginfile.php/2619548/mod_resource/content/3/EBU6304_W5_Rec_Implementation_Testing.pdf)  
[6] [Architecture by QMUL](https://qmplus.qmul.ac.uk/pluginfile.php/2611288/mod_resource/content/3/EBU6304_W4_Rec2_Software%20Architecture.pdf)  
[7] [Design by QMUL](https://qmplus.qmul.ac.uk/pluginfile.php/2586898/mod_resource/content/3/EBU6304_W4_Rec1_Design.pdf)  
[8] [Processes&Agile by QMUL](https://qmplus.qmul.ac.uk/pluginfile.php/2574104/mod_resource/content/6/EBU6304_W1_Rec_Processes_and_Agile.pdf)  
[9] [Handout](https://qmplus.qmul.ac.uk/pluginfile.php/2604460/mod_resource/content/3/EBU6304_GroupProjectHandout_2022.pdf)
[10] [JavaFX](https://openjfx.io/)
[11] [Maven](https://maven.apache.org/)
### Appendix-2 Main Screenshots
