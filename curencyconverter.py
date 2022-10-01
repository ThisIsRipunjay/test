from tkinter import *
from tkinter import ttk

converter = Tk()
converter.title("Unit Converter")
converter.geometry("600x400")

OPTIONS = {   
    "USD to INR":74.54,
    "INR to USD":0.0137
        }

def ok():
    price = ru.get()
    ans = variable1.get()
    DICT = OPTIONS.get(ans,None)
    convert = round(float(DICT)*float(price),2)
    result.delete(1.0,END)
    result.insert(INSERT,price+" ",INSERT,''.join(list(ans)[:3]),INSERT," = ",INSERT,convert,INSERT," "+''.join(list(ans)[-3:]))
appName = Label(converter,text="Currency Converter",font=("arial",25,"bold","underline"),fg="dark red")
appName.place(x=150, y=10)

result = Text(converter,height=5,width=50,font=("arial",10,"bold"),bd=5)
result.place(x=125, y=60)

ind = Label(converter,text="Value of the currency: ",font=("arial",10,"bold"),fg="red")
ind.place(x=30, y=165)

ru = Entry(converter,font=("arial",20))
ru.place(x=200, y=160)

choice = Label(converter,text="Choice:",font=("arial",10,"bold"),fg="red")
choice.place(x=30, y=220)

variable1 = StringVar(converter)
variable1.set(None)
option = OptionMenu(converter,variable1,*OPTIONS)
option.place(x=100 , y=210,width=100, height=40)

button = Button(converter,text="Convert",fg="green",font=("arial",20),bg="powder blue",command=ok)
button.place(x=200, y=210,height=40,width=150)

converter.mainloop()
