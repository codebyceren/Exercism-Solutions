class Badge {
    public String print(Integer id, String name, String department) {
        
        if(department == null) {
            department = "OWNER";
        }else {
            department = department.toUpperCase();
        }

        if(id == null ) {
            return name + " - " + department;
        }
        return "[" + id + "] - " + name  + " - " + department;
    }     
}
