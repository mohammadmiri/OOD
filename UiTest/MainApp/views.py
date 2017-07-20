from django.shortcuts import render

from .forms import MyForm





def form(request):
    form = MyForm()
    context = {'form': form}
    return render(request, 'form.html', context)


def home(request):
    return render(request, 'ood_project/homepage.html')

def add_comment(request):
    return

def add_component(request):
    return render(request, 'ood_project/adds/add_component.html')

def add_component_order(request):
    return render(request, 'ood_project/adds/add_component_order.html')

def add_employee(request):
    return render(request, 'ood_project/adds/add_employee.html')

def add_product(request):
    return render(request, 'ood_project/adds/add_product.html')

def add_production_step(request):
    return render(request, 'ood_project/adds/add_production_step.html')

def add_product_order(request):
    return render(request, 'ood_project/adds/add_product_order.html')

def add_sale_path(request):
    return render(request, 'ood_project/adds/add_sale_path.html')

def add_source(request):
    return render(request, 'ood_project/adds/add_source.html')

def add_supply_path(request):
    return render(request, 'ood_project/adds/add_supply_path.html')

def add_storedata(request):
    return render(request, 'ood_project/adds/add_storedata.html')

def search_advance_products(request):
    names = ['mohammad', ' hamid', 'mehdi', 'hassan', 'hosein']
    context = {'items':names}
    return render(request, 'ood_project/search_advance_products.html', context)

def change_profile(request):
    orders = ['order1', 'order2', 'order3', 'order4']
    context = {'items':orders}
    return render(request, 'ood_project/change_profile.html', context)

def login(request):
    return render(request, 'ood_project/login.html')

def signup(request):
    return render(request, 'ood_project/signup.html')


def change_warehouse_amount(request):
    return render(request, 'ood_project/shows/show_warehouse_amount.html')


def update_component(request):
    return render(request, 'ood_project/updates/update_component.html', {'id':1})

def update_component_order(request):
    return render(request, 'ood_project/updates/update_component_order.html', {'id':1})

def update_supply_path(request):
    return render(request, 'ood_project/updates/update_supply_path.html', {'id':1})

def update_source(request):
    return render(request, 'ood_project/updates/update_source.html', {'id':1})

def update_product(request):
    return render(request, 'ood_project/updates/update_product.html', {'id':1})

def update_sale_path(request):
    return render(request, 'ood_project/updates/update_sale_path.html', {'id': 1})

def update_production_step(request):
    return render(request, 'ood_project/updates/update_supply_path.html', {'id': 1})

def update_product_order(request):
    return render(request, 'ood_project/updates/update_product_order.html', {'id': 1})

def update_employee(request):
    return render(request, 'ood_project/updates/update_employee.html', {'id':1})

def update_storedata(request):
    return render(request, 'ood_project/updates/update_storedata.html')


def show_products(request):
    names = ['mohammad', ' hamid', 'mehdi', 'hassan', 'hosein']
    context = {'items': names}
    return render(request, 'ood_project/shows/show_products.html', context)

def show_one_product(request):
    comments = ['mohammad mohammad mohammad mohammad mohammad mohammad mohammad',
             ' hamid hamid hamid hamid hamid hamid hamid hamid hamid hamid hamid',
             'mehdi mehdi mehdi mehdi mehdi mehdi mehdi mehdi mehdi mehdi mehdi',
             'hassan hassan hassan hassan hassan hassan hassan hassan hassan hassan',
             'hosein hosein hosein hosein hosein hosein hosein hosein hosein hosein']
    context = {'comments': comments}
    return render(request, 'ood_project/shows/show_one_product.html', context)

def show_warehouse_amounts(request):
    items = [1,1,1,1,1]
    return render(request, 'ood_project/shows/show_warehouse_amount.html', {'items':items, 'warehouses':items})

def show_sale_paths(request):
    items = [1,1,1,1,1,1]
    return render(request, 'ood_project/shows/show_sale_paths.html', {'items':items})

def show_supply_paths(request):
    items = [1,1,1,1,1,1]
    return render(request, 'ood_project/shows/show_supply_paths.html', {'items':items})

def show_components(request):
    items = [1,1,1,1,1]
    return render(request, 'ood_project/shows/show_components.html', {'items':items})

def show_employees(request):
    items = [1, 1, 1, 1, 1]
    return render(request, 'ood_project/shows/show_employees.html', {'items':items})


