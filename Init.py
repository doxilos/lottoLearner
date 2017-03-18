from statistics import mean
import pyexcel as pex
import numpy as np
import matplotlib.pyplot as plt

Slots = [1, 2, 3, 4, 5, 6]


# Creates a number list
def CreateNumberArray(X,Y):
    numbers = []
    for X in range(Y):
        numbers.append(X+1)
    return numbers


# Concludes a best fit slope for data
def BestFitSlope(Xs,Ys):
    m = ((mean(Xs) * mean(Ys)) - mean(Xs*Ys)) / ((mean(Xs) * mean(Xs)) - mean(Xs * mean(Xs)))
    return m


def dataExtract(sheet, columnEnd):
    rowList = [1,2,3,4,5,6]
    fullList = []
    for column in range(1, columnEnd):
        for row in range(3,9):
            rowList[row-3]=(sheet[column, row])
        print()
    fullList.append(row)
    return fullList


Numbers = CreateNumberArray(1,54)
#print(Numbers)

sheet = pex.get_sheet(file_name="loto.xls")
fullList = dataExtract(sheet, 3)
print(fullList)