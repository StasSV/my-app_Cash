public class LecturesWorker {
@Autowired
LecturesDao lecturesDao;
public Lecture addLecture(Lecture lecture){
lecture = lecturesDao.addLecture(lecture);
System.out.println(lecture);
return lecture;
}
}
