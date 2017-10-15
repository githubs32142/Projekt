(clear)
(reset)

(deftemplate RiskFactor
(slot sp_alkohol)
(slot otylosc)
(slot pro_jonizujace)
(slot radioterapia)
(slot lam_solarium)
(slot pal_papierosow)
(slot br_akt_fizycznej)
(slot nie_dieta)
(slot br_nat_antykoksydantow)
(slot menopazua_otylosc)
(slot br_blonnika)
(slot pol_elektromagnetyczne)
(slot prom_ultra)
(slot kon_azbest)
(slot wcz_wsp_sexualne)
(slot wcz_rodz)
)

(deftemplate Symptoms
(slot goraczka)
(slot oslabienie)
(slot blad_skory)
(slot apatia)
(slot stan_podgoraczkowe)
(slot os_apetyt)
(slot dusznosc)
(slot kr_jam_ustna)
(slot slk_infekcj)
(slot ob_poty)
(slot mdlosci)
(slot cz_bol_glowy)
(slot cz_bol_brzucha)
(slot sw_skory)
(slot pow_wezly_chlonne)
)

(deftemplate FamillyCancer
(slot brat_pluc)
(slot brat_jelito)
(slot brat_piersi)
(slot brat_jader)
(slot brat_gru_krok)
(slot brat_mozg)
(slot brat_syjki_macic)
(slot brat_pluc)
(slot brat_trzustka)
(slot brat_zoladka)
(slot brat_macicy)
(slot brat_krtani)
(slot siostra_pluc)
(slot siostra_jelito)
(slot siostra_piersi)
(slot siostra_jader)
(slot siostra_gru_krok)
(slot siostra_mozg)
(slot siostra_syjki_macic)
(slot siostra_pluc)
(slot siostra_trzustka)
(slot siostra_zoladka)
(slot siostra_macicy)
(slot siostra_krtani)
(slot ojciec_pluc)
(slot ojciec_jelito)
(slot ojciec_piersi)
(slot ojciec_jader)
(slot ojciec_gru_krok)
(slot ojciec_mozg)
(slot ojciec_syjki_macic)
(slot ojciec_pluc)
(slot ojciec_trzustka)
(slot ojciec_zoladka)
(slot ojciec_macicy)
(slot ojciec_krtani)
(slot matka_pluc)
(slot matka_jelito)
(slot matka_piersi)
(slot matka_jader)
(slot matka_gru_krok)
(slot matka_mozg)
(slot matka_syjki_macic)
(slot matka_pluc)
(slot matka_trzustka)
(slot matka_zoladka)
(slot matka_macicy)
(slot matka_krtani)
(slot dziadek_pluc)
(slot dziadek_jelito)
(slot dziadek_piersi)
(slot dziadek_jader)
(slot dziadek_gru_krok)
(slot dziadek_mozg)
(slot dziadek_syjki_macic)
(slot dziadek_pluc)
(slot dziadek_trzustka)
(slot dziadek_zoladka)
(slot dziadek_macicy)
(slot dziadek_krtani)
(slot babcia_pluc)
(slot babcia_jelito)
(slot babcia_piersi)
(slot babcia_jader)
(slot babcia_gru_krok)
(slot babcia_mozg)
(slot babcia_syjki_macic)
(slot babcia_pluc)
(slot babcia_trzustka)
(slot babcia_zoladka)
(slot babcia_macicy)
(slot babcia_krtani)
(slot wujek_pluc)
(slot wujek_jelito)
(slot wujek_piersi)
(slot wujek_jader)
(slot wujek_gru_krok)
(slot wujek_mozg)
(slot wujek_syjki_macic)
(slot wujek_pluc)
(slot wujek_trzustka)
(slot wujek_zoladka)
(slot wujek_macicy)
(slot wujek_krtani)
(slot ciotka_pluc)
(slot ciotka_jelito)
(slot ciotka_piersi)
(slot ciotka_jader)
(slot ciotka_gru_krok)
(slot ciotka_mozg)
(slot ciotka_syjki_macic)
(slot ciotka_pluc)
(slot ciotka_trzustka)
(slot ciotka_zoladka)
(slot ciotka_macicy)
(slot ciotka_krtani)
)

(defrule defrule1
	 (exists (or  (and (RiskFactor (otylosc Tak))( Symptoms (blad_skory Tak)))))
	=>
	 (printout t " is likely to have Skin Cancer" crlf)
)
(facts)
(run)
