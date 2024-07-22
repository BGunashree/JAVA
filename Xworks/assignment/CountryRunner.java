class CountryRunner
{
	public static void main(String[] args)
	{
		String[] indiaStates={"Karnataka","Andhra Pradesh","Arunchal Pradesh","Assam","Bihar","Goa","Chhattisgarh","Gujurat","Haryana","Himachal Pradesh","Jarkhand","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal"};
		Country.statesInIndia(indiaStates);
		int[] codes={562135,587316,560050,560070,560001,560083,560103,560099,560053,560100};
		Country.pincode(codes);
		String[] primeMinisters={"Nehru","Gulzarilal Nanda","Lal Bahadur Shastri","Indira Gandhi","Morarji Desai","Charan Singh","Rajiv Gandhi","Chandra Shekar","Narasimha Rao","Atal Bihari Vajpayee","H.D. Deve Gowda","Inder Kumar Gujral","Manmohan Singh","Narendra Modi"};
	    String[] ministers={"Raj Nath Singh","Amit Shah","Nitin jairam Gakari","Jagat Prakash Nadda","Shivraj Singh Chouhan","Nirmala Sitharaman","Subrahmanyam jaishankar","Manohar Lal","Kumaraswamy","Piyush Goyal","Dharmendra Pradhan","Jitan Ram Manjhi","Rajiv Ranjan Singh","Sarbananda Sonowal","Virendra Kumar","Rammohan Naidu","Pralhad Joshi","Jual Oram","Giriraj Singh","Ashwini Vaishnav","Jyotiraditya M. Scindla","Bhupender Yadav","Gajendra Singh","Anupama Devi","Kiren Rijiju","Hardeep Singh Puri","Manushk ","Kishan Reddy","Chirag Paswan","C R Patil"};
		Country.cabinetMinisters(ministers);
		Country.primeMinistersOfIndia(primeMinisters);
		String[] parties={"Congress","AAAam Aadmi Party","BJP","National People's Party","Bahujan Samaj Party"};
		Country.politicalparties(parties);
	}

}