class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        
        
        if(operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
            
        }else if (operation.equals("")){
            throw new IllegalArgumentException("Operation cannot be empty");  
            
        }else if(operation.equals("+")){
            int result = operand1 + operand2;
            return operand1 + " " + operation + " " + operand2 + " = " + result; 
            
        }else if(operation.equals("*")){
            int result = operand1 * operand2;
            return operand1 + " " + operation + " " + operand2 + " = " + result; 
            
        }else if(operation.equals("/")){
            try{
                int result = operand1 / operand2;
                return operand1 + " " + operation + " " + operand2 + " = " + result;
            }catch(ArithmeticException e){
                throw new IllegalOperationException("Division by zero is not allowed", e);
            }
            
            
        }else{
            throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
            
    
    
    }
}
