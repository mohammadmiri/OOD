
from django import forms



class MyForm(forms.Form):
    name = forms.CharField(max_length=100, label='نام')
    lastName = forms.CharField(max_length=100, label='فامیلی')
    date = forms.DateField(label='تاریخ',)
    isJoined = forms.BooleanField(label='هستید')
    dateTime = forms.DateTimeField(label='زمان')
    grade = forms.IntegerField(label='نمره')

