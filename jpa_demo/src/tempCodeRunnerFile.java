Model fromDatabase = em.find(Model.class, 0);
            // em.getTransaction().begin();
            // fromDatabase.setYear(2022);
            // // This object is already staged, since it was retrieved from the EntityManager.
            // // We just need to flush the change.
            // em.getTransaction().commit();