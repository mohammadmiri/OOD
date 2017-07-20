from django import template


register = template.Library()



@register.filter(name='add_class')
def add_class(value, classes):
    return value.as_widget(attrs={'class': classes})


@register.filter(name='get_klass')
def get_klass(ob):
    return ob.__class__.__name__
















