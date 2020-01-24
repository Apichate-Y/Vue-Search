<template>
  <v-app>
    <v-app-bar app>
      <v-toolbar-title class="headline text-uppercase">
        <span>search user demo</span>
      </v-toolbar-title>
      <v-spacer></v-spacer>
      <v-btn text href="https://vuetifyjs.com/en/getting-started/quick-start" target="_blank">
        <span class="mr-2">GET STARTED</span>
      </v-btn>
    </v-app-bar>

    <v-content>
      <router-view/>
    </v-content>
  </v-app>
</template>

<script>
export default {
  name: "App",
  data: () => ({})
};
</script>