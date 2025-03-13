#include <iostream>
#include <list>
#include <map>
using namespace std;

int main()
{  /*list<int>montab;
cout<<"Taille:\n"<<montab.size()<<endl;
  montab.push_front(5);
  montab.push_back(5);
 for(list<int>::iterator it=montab.begin(); it!=montab.end(); ++it){


  cout<<' '<<*it;

 }*/
 /*list<int> mylist;
 list <int>::iterator it;

 mylist.push_back(1);
 mylist.push_back(2);
 it= mylist.begin();
 ++it;
 mylist.insert (it,10);
 cout<<"mylist contains:"<<endl ;
 for(it=mylist.begin(); it!=mylist.end();++it)
 {
     cout<<"le contenu est "<<*it<<endl;
 }

   it= mylist.begin();
while (it !=mylist.end())
{
    it= mylist.erase(it);
}
cout <<"mylist"<<endl;
for(it=mylist.begin(); it!=mylist.end();++it)
 {
     cout<<"le contenu devient "<<*it<<endl;
 }*/
/*map<string,unsigned int>montab;
 montab["janvier"]=31;
 montab["Fevrier"]=28;
  montab["Mars"]=31;
  montab.size();
  for(map <string, unsigned int>::iterator it=montab.begin(); it!=montab.end();++it){
    cout<<it->first<<"->\t"<<it->second<<endl;
  }
  cout<<"le nb de jrs du mois janvier est:"<<montab.find("janvier")->second<<endl;*/
 map<int,int> mp;
  mp.insert({2,30});
   mp.insert( {1,40});
    mp.insert({3,60});
     mp.insert({2,20});
      mp.insert({5,50});
      cout<<"KEY\tElement\n";
      for (map<int,int>::iterator itr =mp.begin();itr !=mp.end();++itr){
        cout<<itr->first
        <<'\t' << itr->second <<'\n';
      }
    return 0;
}

