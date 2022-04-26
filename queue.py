class QUEUE_LIST:
    def __init__(self):
        self.queue=[]
        print("QUEUE... Created")
    def add_fun(self,data):
         self.queue.append(data)  #self.queue.insert(pos,"value") ater value move ed to next value
    def del_fun(self):
        del self.queue[0]   #self.queue=self.queue[:-1] delete the last element
    def display_fun(self):
        print(self.queue)
n=int(input("How many You want to enter...?"))
list_obj=QUEUE_LIST()
for i in range(1,n+1):
    k=int(input("Enter the {} Element".format(i)))             
    list_obj.add_fun(k)
list_obj.display_fun()
n=int(input("How many You Waant tto delete...?"))
for i in range(n):
    list_obj.del_fun()
list_obj.display_fun()


class QUEUE_DICT:
    def __init__(self):
        self.stack={}
        print("STACK... Created")
    def add_fun(self,dict_key,dict_value):
         self.stack[dict_key]=dict_value
    def del_fun(self):
        lista=list(self.stack.keys())
        self.stack.pop(lista[0])
    def display_fun(self):
        print(self.stack)
n=int(input("How many You want to enter...?"))
dict_obj=QUEUE_DICT()
for i in range(1,n+1):
    dict_key=input("Enter the {} Element \"Key   \"".format(i))
    dict_value=input("Enter the {} Element \"Value   \"".format(i))
    dict_obj.add_fun(dict_key,dict_value)
dict_obj.display_fun()
n=int(input("How many You Waant tto delete...?"))
for i in range(n):
    dict_obj.del_fun()
dict_obj.display_fun()