from django.conf.urls import url

from . import views

urlpatterns = [
    url(r'homepage$', views.home, name='homepage'),
    url(r'add_comment.html$',  views.add_comment, name='add_comment.html'),
    url(r'add_component$', views.add_component, name='add_component'),
    url(r'add_component_order$', views.add_component_order, name='add_component_order'),
    url(r'add_employee$', views.add_employee, name='add_employee'),
    url(r'add_product$', views.add_product, name='add_product'),
    url(r'add_production_step$', views.add_production_step, name='add_production_step'),
    url(r'add_product_order$', views.add_product_order, name='add_product_order'),
    url(r'add_sale_path$', views.add_sale_path, name='add_sale_path'),
    url(r'add_source$', views.add_source, name='add_source'),
    url(r'add_supply_path$', views.add_supply_path, name='add_supply_path'),
    url(r'search_advance_products$', views.search_advance_products, name='search_advance_products'),
    url(r'change_profile$', views.change_profile, name='change_profile'),
    url(r'login.html$', views.login, name='login.html'),
    url(r'signup$', views.signup, name='signup'),
    url(r'show_products$', views.show_products, name='show_products'),
    url(r'show_one_product$', views.show_one_product, name='show_one_product'),
    url(r'show_warehouse_amount$', views.show_warehouse_amounts, name='show_warehouse_amounts'),
    url(r'change_warehouse_amounts$', views.change_warehouse_amount, name='change_warehouse_amounts'),

    url(r'update_component', views.update_component ),
    url(r'update_component_order', views.update_component_order ),
    url(r'update_employee', views.update_employee),
    url(r'update_product', views.update_product),
    url(r'update_product_order', views.update_product_order),
    url(r'update_production_step', views.update_production_step),
    url(r'update_sale_path', views.update_sale_path),
    url(r'update_supply_path', views.update_supply_path),
]





