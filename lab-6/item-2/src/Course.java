class Course {
    private String[] students;
    private String[] temp;
    private int size;

    public Course(){
        this.size = 0;
        students = new String[size];
    }

    //function
    public void add(String studentName){
        temp = new String[size];
        for(int i=0;i<size;i++){
            temp[i] = students[i];
        }
        size++;
        students = new String[size];
        for(int i=0;i<size;i++){
            if(i!=size-1){
                students[i] = temp[i];
            }
            else{
                students[size-1] = studentName;
            }
        }
    }

    public void dropStudent(String studentName){
        int posRemove = 0;
        for(int i=0;i<size;i++){
            if(students[i].equals(studentName)){
                posRemove += i;
                break;
            }
        }
        temp = new String[size];
        for(int i=0;i<size;i++){
            if(i<posRemove){
                temp[i] = students[i];
            }
            else if(i>posRemove){
                temp[i-1] = students[i];
            }
        }
        students = new String[--size];
        for(int i=0;i<size;i++){
            students[i] = temp[i];
        }
    }

    public void clear(){
        students = new String[0];
    }

    //render
    public void displayStudents(){
        System.out.println("Student: ");
        for(int i=0;i<size;i++){
            System.out.println(students[i]);
        }
        System.out.println("------------");
    }
}
