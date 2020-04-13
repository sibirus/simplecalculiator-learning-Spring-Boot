package com.simplecalculiator.simplecalculiator.domain;



public class Enter
{
    private Double exit;

    public Double getExit() {
        return exit;
    }

    public void setExit(Double exit) {
        this.exit = exit;
    }

    public Enter(Double exit)
    {
        this.exit = exit;
    }

    private Double NumberOne;
    private Double NumberTwo;
    private char Operation;

    public Enter(Double numberOne, Double numberTwo, char operation)
    {
        NumberOne = numberOne;
        NumberTwo = numberTwo;
        Operation = operation;
    }




    public Enter()
    {

    }

    public Double getNumberOne() {
        return NumberOne;
    }

    public void setNumberOne(Double numberOne) {
        NumberOne = numberOne;
    }

    public Double getNumberTwo() {
        return NumberTwo;
    }

    public void setNumberTwo(Double numberTwo) {
        NumberTwo = numberTwo;
    }

    public char getOperation() {
        return Operation;
    }

    public void setOperation(char operation) {
        Operation = operation;
    }

    /////////////////////////////////////////
    public Double calc ()
    {


        if (Operation=='*')
        {
            exit=NumberOne*NumberTwo;
        }
        if (Operation=='/')
        {
            exit=NumberOne/NumberTwo;
        }
        if (Operation=='+')
        {
            exit=NumberOne+NumberTwo;
        }
        if (Operation=='-')
        {
            exit=NumberOne-NumberTwo;
        }
        return exit;

    }
}



